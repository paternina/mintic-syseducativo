document.addEventListener('DOMContentLoaded', () => {
    let formularioCertificado = document.getElementById('certificado-formulario')
    if (formularioCertificado) {
        formularioCertificado.addEventListener('submit', crearCertificado)
    }
    listarCertificado()
})