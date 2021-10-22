document.addEventListener('DOMContentLoaded', () => {
    let formularioNotas = document.getElementById('notas-formulario')
    if (formularioNotas) {
        formularioNotas.addEventListener('submit', crearNotas)
    }
    listarNotas()
})