function validar() {
    validarNombre();
    validarApellido(1);
    validarApellido(2);
    validarDireccion();
    validarSelect('#provincia');
    validarSelect('#departamento');
    validarEmail();
    validarFijo();
    validarMovil();
}



function mostrarError(idInput, idSmall, mensajeError) {
    $(idInput).addClass('is-invalid');
    $(idSmall).html(mensajeError);
    $(idSmall).attr('class', 'text-danger');
}

function validarNombre() {
    let patronLetras = /^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]{3,}$/;
    if (!patronLetras.test($('#nombre').val()))
        mostrarError('#nombre', '#nombre-small', 'Los nombres solo debe contener espacio letras, mínimo 3 caracteres, no debe contener número o caracteres especiales.');
}

function validarApellido(i) {
    let patronLetras = /^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]{3,}$/;
    if (!patronLetras.test($(`#apellido${i}`).val()))
        mostrarError(`#apellido${i}`, `#apellido${i}-small`, 'Los apellidos solo debe contener espacio letras, mínimo 3 caracteres, no debe contener número o caracteres especiales.')
}

function validarDireccion() {
    let patronDireccion = /^[\s\S]{5,}$/;
    if (!patronDireccion.test($('#direccion').val()))
        mostrarError('#direccion', '#direccion-small', 'La direccion solo puede contener números, letras y símbolos, mínimo 5 caracteres.');

}

function validarSelect(id) {
    let patronSelect = /^[\s\S]{1,}$/;
    if (!patronSelect.test($(id).val()))
        mostrarError(id, `${id}-small`, 'Debe seleccionarse un dato, no puede quedar sin selección.')
}

function validarEmail() {
    let patronEmail = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!patronEmail.test($('#email').val()))
        mostrarError('#email', '#email-small', 'Debe ser válido, considerar el formato correcto en extensión y dominios.');
}

function validarFijo() {
    let patronFijo = /^\d*$/
    if ($('#fijo').val().trim().length > 0) {
        if (!patronFijo.test($('#fijo').val().trim()))
            mostrarError('#fijo', '#fijo-small', 'Puede quedar vacío, en caso de ingresar dato solo es permitido números');
    }
}

function validarMovil() {
    let patronMovil = /^\d{9}$/
    if (!patronMovil.test($('#movil').val()))
        mostrarError('#movil', '#movil-small', 'Es requerido, solo se permite ingresar números de 9 dígitos.')
}