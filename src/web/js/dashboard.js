// function to set a given theme/color-scheme
function setTheme(themeName) {
    localStorage.setItem('theme', themeName);
    document.documentElement.className = themeName;
}

// function to toggle between light and dark theme
function toggleTheme() {
    if (localStorage.getItem('theme') === 'theme-dark') {
        setTheme('theme-light');
    } else {
        setTheme('theme-dark');
    }
}

// Immediately invoked function to set the theme on initial load
(function () {
    if (localStorage.getItem('theme') === 'theme-dark') {
        setTheme('theme-dark');
        document.getElementById('slider').checked = false;
    } else {
        setTheme('theme-light');
        document.getElementById('slider').checked = true;
    }

    if (localStorage.getItem('access_token') === null) {
        // Redirect to login if not access_token
        window.location = "/auth/login.html"
    }
})();

document.addEventListener('DOMContentLoaded', () => {
    let formularioMateria = document.getElementById('materia-formulario')
    if (formularioMateria) {
        formularioMateria.addEventListener('submit', crearMateria)
    }
    listarMaterias()
})

