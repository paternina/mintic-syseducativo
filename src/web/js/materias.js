//Listar Materias
function listarMaterias() {
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/materia", requestOptions)
        .then(response => response.json())
        .then(result => { console.log(result) })
        .catch(error => console.log('error', error));
}

// Crear materia
function crearMateria(e) {
    e.preventDefault()
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer " + localStorage.getItem('access_token'));
    myHeaders.append("Content-Type", "application/json");

    var raw = JSON.stringify({
        "name": document.getElementById("nombremateria").value
    });

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/materia", requestOptions)
        .then(response => response.text())
        .then(result => JSON.parse(result))
        .catch(error => console.log('error', error));
}