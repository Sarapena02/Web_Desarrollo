function validarCedula() {
    // Obtiene el valor de la cédula ingresada por el usuario
    var cedula = document.getElementById("cedula").value;

    // Realiza una petición AJAX al servidor para verificar si la cédula ya existe
    // Aquí debes implementar la lógica para verificar la cédula en tu backend

    // Si la cédula ya existe, muestra la alerta y evita enviar el formulario
    if (cedulaExiste) {
        document.getElementById("alerta").style.display = "block";
        return false; // Evita que el formulario se envíe
    }

    // Si la cédula no existe, permite que el formulario se envíe
    return true;
}