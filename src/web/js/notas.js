document.addEventListener('DOMContentLoaded', () => {
    let formularioNotas = document.getElementById('notas-formulario')
    if (formularioNotas) {
        formularioNotas.addEventListener('submit', crearNotas)
    }
    listarNotas()
})

//Listar Notas
function listarNotas() {
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/notas", requestOptions)
        .then(response => response.json())
        .then(result => { console.log(result) })
        .catch(error => console.log('error', error));
}

// Crear Notas
function crearNotas(e) {
    e.preventDefault()
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    myHeaders.append("Content-Type", "application/json");

    var raw = JSON.stringify({
        "nombre": document.getElementById("nombre").value,
        "apellido": document.getElementById("apellido").value,
        "grado": document.getElementById("grado").value,
        "general": document.getElementById("general").value,
        "general": document.getElementById("porMateria").value,
        "bimestre": document.getElementById("bimestre").value,
        "semestre": document.getElementById("semestre").value,
        "año": document.getElementById("año").value,
        "Sí": document.getElementById("Sí").value,
        "Sí": document.getElementById("No").value
    });

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/notas", requestOptions)
        .then(response => response.text())
        .then(result => JSON.parse(result))
        .catch(error => console.log('error', error));
}