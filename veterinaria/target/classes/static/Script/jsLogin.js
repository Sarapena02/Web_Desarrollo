    document.addEventListener("DOMContentLoaded", function(){
        //Arreglo clientes
        const clientes = [
            { username: "cliente1", password: "c1" },
            { username: "cliente2", password: "c2" },
        ];
    
        //Arreglo empleados
        const veterinarios = [
            { username: "vet1", password: "c1" },
            { username: "ve2", password: "c2" },
        ];

    //Se obtiene el formulario de login
    const loginForm = document.getElementById("login-form");

    loginForm.addEventListener("submit", function(event){
        event.preventDefault()
        //Se obtienen las variables de username y password
        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;

        //Se busca en el arreglo de clientes si esta ese usuario y contraseña
        const cliente = clientes.find(cliente => cliente.username === username && cliente.password === password);

        //Se busca en el arreglo de veterinarios si esta ese usuario y contraseña
        const veterinario = veterinarios.find(veterinario => veterinario.username === username && veterinario.password === password);

        //Se redirecciona a la pagina necesaria
        if (cliente) {
            window.location.href = "clientes.html";
        } else if (veterinario){
            window.location.href = "veterinarios.html";
        }else{
            alert("Usuario o contraseña incorrectas")
        }

    });

    

    


});
