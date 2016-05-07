$(document).ready(function () {
    $("#reg_form").validate({
        rules: {
            firstname: {
                required: true,
                minlength: 2,
                maxlength: 20
            },
            surname: {
                required: true,
                minlength: 2,
                maxlength: 20
            },
            login: {
                required: true,
                minlength: 8,
                maxlength: 16
            },
            email: {
                required: true,
                email: true
            },
            age: {
                required: true
            },
            password: {
                required: true,
                minlength: 8,
                maxlength: 16
            },
            repassword: {
                required: true,
                minlength: 8,
                maxlength: 16,
                equalTo: "#password"
            }
        },
        messages: {
            firstname: {
                required: "Please fill this",
                minlength: "Min symbols: 5",
                maxlength: "Max symbols: 20"
            },
            surname: {
                required: "Please fill this",
                minlength: "Min symbols: 5",
                maxlength: "Max symbols: 20"
            },
            login: {
                required: "Please fill this",
                minlength: "Min symbols: 8",
                maxlength: "Max symbols: 16"
            },
            email: {
                required: "Please fill this",
                email: "Please fill correct email"
            },

            password: {
                required: "Please fill this",
                minlength: "Min symbols: 8",
                maxlength: "Max symbols: 16"
            },
            repassword: {
                required: "Please fill this",
                minlength: "Min symbols: 8",
                maxlength: "Max symbols: 16",
                equalTo: "Passwords don't match"
            }
        }
    });
});

