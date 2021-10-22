document.addEventListener('DOMContentLoaded', () => {
    let formularioCertificado = document.getElementById('certificado-formulario')
    if (formularioCertificado) {
        formularioCertificado.addEventListener('submit', crearCertificado)
    }
    listarCertificados()
})

//Listar Certificados
function listarCertificados() {
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/certificados", requestOptions)
        .then(response => response.json())
        .then(result => { console.log(result) })
        .catch(error => console.log('error', error));
}

// Crear Certificado
function crearCertificado(e) {
    e.preventDefault()
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    myHeaders.append("Content-Type", "application/json");

    var raw = JSON.stringify({
        "grado": document.getElementById("id").value,
        "nombre": document.getElementById("nombre").value,
        "apellido": document.getElementById("apellido").value,
        "jornada": document.getElementById("mañana").value,
        "jornada": document.getElementById("tarde").value,
        "nombre": document.getElementById("nombre").value,
        "apellido": document.getElementById("apellido").value,
        "email": document.getElementById("email").value,
        "esactual": document.getElementById("si").value,
        "esactual": document.getElementById("no").value,
        "Sí": document.getElementById("Sí").value,
        "Sí": document.getElementById("No").value
    });

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/certificados", requestOptions)
        .then(response => response.text())
        .then(result => JSON.parse(result))
        .catch(error => console.log('error', error));
}