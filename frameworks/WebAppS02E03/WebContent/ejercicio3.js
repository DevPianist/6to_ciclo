function btnIngresar() {
    let usuario = $("#usuario").val();
    let contra = $("#contra").val();
    if (validate(usuario, contra)) {
        $("#divresultado").html('Usuario correcto');
    }
}

function validate(usuario, contra) {
    if (usuario == 'Admin' && contra == 'Ua12345')
        return true;
    else {
        $("#divresultado").html('Usuario incorrecto');
        return false;
    }
}