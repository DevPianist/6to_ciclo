// VALIDAR CAMPOS AL MENOS UN CARACTER
function validar() {
    let nombre = $('#name').val();
    let apellidos = $('#lastname').val();
    let telefono = $('#telefono').val();
    let email = $('#email').val();
    let mensaje = $('#mensaje').val();
    if (validarCaracter(nombre) && validarCaracter(apellidos) &&
        validarCaracter(telefono) && validarCaracter(email) &&
        validarCaracter(mensaje)) {
        $('#titleresult').html(`Datos del pedido registrado`);
        $('#error').html(``);
        $('#datos').html(`
        <p>Nombre: ${nombre}</p>
        <p>Apellidos: ${apellidos}</p>
        <p>Teléfono: ${telefono}</p>
        <p>E-mail: ${email}</p>
        <p>Mensaje: ${mensaje}</p>
        `);
    } else {
        $('#titleresult').html(``);
        $('#error').html(`
        <div class="alert alert-danger" role="alert">
        Ingrese datos a todos los campos
        </div>
            `);
    }
}

function borrarDatos() {
    $('#titleresult').html(``);
    $('#error').html(``);
    $('#datos').html(``);

    $('#name').val('');
    $('#lastname').val('');
    $('#telefono').val('');
    $('#email').val('');
    $('#mensaje').val('');
}

function validarCaracter(text) {
    if (text.trim().length >= 1) return true;
    else return false;
}