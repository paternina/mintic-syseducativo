document.addEventListener('DOMContentLoaded', () => {

    // Get all "toogle" elements
    const $navbarBurgers = Array.prototype.slice.call(document.querySelectorAll('.toggle'), 0);
    const $modalTriggers = Array.prototype.slice.call(document.querySelectorAll('.modal-trigger'), 0);

    // Check if there are any navbar burgers
    if ($navbarBurgers.length > 0) {

        // Add a click event on each of them
        $navbarBurgers.forEach(el => {
            el.addEventListener('click', () => {

                // Get the target from the "data-target" attribute
                const target = el.dataset.target;
                const $target = document.getElementById(target);

                // Toggle the "is-active" class on both the "toogle" and the "navbar-menu"
                el.classList.toggle('is-active');
                $target.classList.toggle('is-active');

            });
        });
    }

    // Open Modal

    if ($modalTriggers.length > 0) {
        $modalTriggers.forEach(el => {
            el.addEventListener('click', () => {
                const target = el.dataset.target;
                const $target = document.getElementById(target);

                el.classList.toggle('is-active');
                $target.classList.add('is-active');
            })
        })
    }

    window.onclick = function (event) {
        // Close Modal if we click outside de modal-body
        if (event.target.classList.contains('modal')) {
            event.target.classList.toggle('is-active')
        }
        // Close Modal if we click the X button in the modal

        if (event.target.classList.contains('modal-close')) {
            event.target.parentNode.parentNode.classList.toggle('is-active')
        }
    }

});