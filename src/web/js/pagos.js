document.addEventListener('DOMContentLoaded', () => {
    let formularioPagos = document.getElementById('pagos-formulario')
    if (formularioPagos) {
        formularioPagos.addEventListener('submit', crearPagos)
    }
    listarPagos()
})