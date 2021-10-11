// Helpers
const _$ = element => document.querySelector(element)
const __$ = element => document.querySelectorAll(element)
// fin helpers
window.addEventListener('DOMContentLoaded', () => {
    let loginform = _$('#login-form')
    loginform.addEventListener('submit', login)
})

function login(event) {
    event.preventDefault()
    let username = _$('#username')
    let password = _$('#password')
    if (username.value === "" || password.value === "") {
        let error = _$('.error')
        error.innerHTML = "No se pueden enviar valores vacios"
    } else {
        window.location.replace('/src/dashboard/index.html')
    }
}
