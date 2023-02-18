const togglePassword = document.querySelector("#togglePassword");
      const password = document.querySelector("#id_password");

      togglePassword.addEventListener("click", function (e) {
        const type =
          password.getAttribute("type") === "password" ? "text" : "password";
        password.setAttribute("type", type);
        if (togglePassword.className == "far fa-eye-slash") {
          togglePassword.className = "far fa-eye";
        } else {
          togglePassword.className = "far fa-eye-slash";
        }
      });