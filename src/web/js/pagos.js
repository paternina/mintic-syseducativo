document.addEventListener('DOMContentLoaded', () => {
    let formularioPagos = document.getElementById('pagos-formulario')
    if (formularioPagos) {
        formularioPagos.addEventListener('submit', crearPagos)
    }
    listarPagos()
})

//Listar Pagos
function listarPagos() {
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/pagos", requestOptions)
        .then(response => response.json())
        .then(result => { console.log(result) })
        .catch(error => console.log('error', error));
}

// Crear Pagos
function crearPagos(e) {
    e.preventDefault()
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    myHeaders.append("Content-Type", "application/json");

    var raw = JSON.stringify({
        "nombre": document.getElementById("nombre").value,
        "apellido": document.getElementById("apellido").value,
        "grado": document.getElementById("grado").value,
        "mañana": document.getElementById("mañana").value,
        "mañana": document.getElementById("tarde").value,
        "lenguaje": document.getElementById("matricula").value,
        "lenguaje": document.getElementById("pension").value,
        "nombre": document.getElementById("nombre").value,
        "apellido": document.getElementById("apellido").value,
        "email": document.getElementById("email").value,
        "Sí": document.getElementById("Sí").value,
        "Sí": document.getElementById("No").value
    });

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/pagos", requestOptions)
        .then(response => response.text())
        .then(result => JSON.parse(result))
        .catch(error => console.log('error', error));
}