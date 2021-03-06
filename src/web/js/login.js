// Helpers
const _$ = element => document.querySelector(element)
const __$ = element => document.querySelectorAll(element)
const host = "http://localhost:8080"

// fin helpers
window.addEventListener('DOMContentLoaded', () => {
    let loginform = _$('#login-form')
    loginform.addEventListener('submit', login)
})

function login(event) {
    event.preventDefault()

    let username = _$("#username").value
    let password = _$("#password").value

    if (username !== "" && password !== "") {
        let myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/x-www-form-urlencoded");
        //myHeaders.append("Content-Type", "application/json");
        //myHeaders.append("Authorization", `Bearer ${localStorage.getItem('access_token')}`);

        let urlencoded = new URLSearchParams();
        urlencoded.append("username", username);
        urlencoded.append("password", password);

        let requestOptions = {
            method: 'POST',
            headers: myHeaders,
            body: urlencoded,
            redirect: 'follow'
        };

        fetch("http://localhost:8080/api/auth/token/new", requestOptions)
            .then(response => response.text())
            .then(result => {
                let res = JSON.parse(result)
                if (res.access_token) {
                    window.localStorage.setItem("access_token", res["access_token"])
                    window.localStorage.setItem("refresh_token", res["refresh_token"])
                    console.log("Log in successfully")
                    window.location = "/dashboard/index.html"
                } else {
                    console.error("Log in failed")
                    _$(".error").innerHTML = res["errorMessage"]
                }
            })
            .catch(error => console.log('error', error));

    } else {
        _$(".error").innerHTML = "Rellene los campos requeridos"
    }
}