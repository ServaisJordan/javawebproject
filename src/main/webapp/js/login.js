onload = function() {
    userNameInput = document.getElementById("userNameInput");
    userNameError = document.getElementById("userNameError");

    passwordInput = document.getElementById("passwordInput");
    passwordError = document.getElementById("passwordError");

    setInterval(check(userNameInput, checkLib("\w", 6), userNameError), 50);
    setInterval(check(passwordInput, checkLib("\w", 6), passwordError), 50);
}

function check(champ, checkAction, errorChamp) {
    return function() {
        var lib = champ.value;

        if (!lib) errorChamp.display = !checkAction(lib);
    }
}

function checkLib(pattern, length) {
    return function(lib) {
        return new RegExp(pattern).exec(lib) && lib.length > length;
    }
}