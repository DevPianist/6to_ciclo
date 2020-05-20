let errores = [];

function validar() {
    errores = [];
    validarNombre();
    validarApellido(1);
    validarApellido(2);
    validarDireccion();
    validarSelect('#provincia');
    validarSelect('#departamento');
    validarEmail();
    validarFijo();
    validarMovil();
    console.log(errores.length);
    if (errores.length == 0) {
        alert('Datos guardados correctamente')
    }
}



function mostrarError(idInput, idSmall, mensajeError) {
    errores.push(1);
    $(idInput).addClass('is-invalid');
    $(idSmall).html(mensajeError);
    $(idSmall).attr('class', 'text-danger');
}

function correcto(idInput, idSmall, mensaje) {
    $(idInput).removeClass('is-invalid');
    $(idInput).addClass('is-valid');
    $(idSmall).html(mensaje);
    $(idSmall).attr('class', 'text-success');
}

function validarNombre() {
    let patronLetras = /^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]{3,}$/;
    if (!patronLetras.test($('#nombre').val()))
        mostrarError('#nombre', '#nombre-small', 'Los nombres solo debe contener espacio letras, mínimo 3 caracteres, no debe contener número o caracteres especiales.');
    else
        correcto('#nombre', '#nombre-small', 'Nombre');

}

function validarApellido(i) {
    let patronLetras = /^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]{3,}$/;
    if (!patronLetras.test($(`#apellido${i}`).val()))
        mostrarError(`#apellido${i}`, `#apellido${i}-small`, 'Los apellidos solo debe contener espacio letras, mínimo 3 caracteres, no debe contener número o caracteres especiales.')
    else
        correcto(`#apellido${i}`, `#apellido${i}-small`, (i == 1) ? 'Primer apellido' : 'Segundo apellido')
}

function validarDireccion() {
    let patronDireccion = /^[\s\S]{5,}$/;
    if (!patronDireccion.test($('#direccion').val()))
        mostrarError('#direccion', '#direccion-small', 'La direccion solo puede contener números, letras y símbolos, mínimo 5 caracteres.');
    else
        correcto('#direccion', '#direccion-small', 'Calle, número, piso, puerta')
}

function validarSelect(id) {
    let patronSelect = /^[\s\S]{1,}$/;
    if (!patronSelect.test($(id).val()))
        mostrarError(id, `${id}-small`, 'Debe seleccionarse un dato, no puede quedar sin selección.');
    else
        correcto(id, `${id}-small`, (id == '#provincia') ? 'Provincia' : 'Departamento');
}

function validarEmail() {
    let patronEmail = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!patronEmail.test($('#email').val()))
        mostrarError('#email', '#email-small', 'Debe ser válido, considerar el formato correcto en extensión y dominios.');
    else
        correcto('#email', '#email-small', '')
}

function validarFijo() {
    let patronFijo = /^\d*$/
    if ($('#fijo').val().trim().length > 0) {
        if (!patronFijo.test($('#fijo').val().trim()))
            mostrarError('#fijo', '#fijo-small', 'Puede quedar vacío, en caso de ingresar dato solo es permitido números');
        else
            correcto('#fijo', '#fijo-small', 'Fijo')
    } else
        correcto('#fijo', '#fijo-small', 'Fijo')
}

function validarMovil() {
    let patronMovil = /^\d{9}$/
    if (!patronMovil.test($('#movil').val()))
        mostrarError('#movil', '#movil-small', 'Es requerido, solo se permite ingresar números de 9 dígitos.');
    else
        correcto('#movil', '#movil-small', 'Móvil');
}