//Toggle Visisbility
const showToggle = document.getElementById("show-hide")
showToggle.addEventListener('click', () => {
    const inputField = showToggle.nextElementSibling
    if (inputField.type === "text") {
        inputField.type = "password"
    }
    else if (inputField.type === "password") {
        inputField.type = "text"
    }
})


//Password Checks

const strengthMeter = document.getElementById("strength-meter")
const passwordInput = document.getElementById("password")
const checksContainer = document.getElementById("checks")

passwordInput.addEventListener("input", updateStrengthMeter)

function updateStrengthMeter() {
    const weaknesses = calculateStrength(passwordInput.value)
    let strength = 100
    checksContainer.innerHTML = ''
    weaknesses.forEach(weakness => {
        const reasonsContainer = document.createElement('div')
        reasonsContainer.classList.add("checks")

        //Calculate strength value
        strength -= weakness.deduction



        //Add class to checks
        if (weakness.status === "error") {
            //Adding appropriate icon
            const iconElement = document.createElement("i")
            iconElement.classList.add("fa", "fa-exclamation-circle")
            reasonsContainer.append(iconElement)

            //Removing old class adn adding new
            reasonsContainer.classList.remove("success")
            reasonsContainer.classList.add(weakness.status)
        }
        else if (weakness.status === "success") {
            //Adding appropriate icon
            const iconElement = document.createElement("i")
            iconElement.classList.add("fa", "fa-check")
            reasonsContainer.append(iconElement)

            //Removing old class adn adding new
            reasonsContainer.classList.remove("error")
            reasonsContainer.classList.add(weakness.status)
        }

        //Add message in small
        const messageElement = document.createElement("small")
        messageElement.classList.add("reasons")
        messageElement.innerText = weakness.message
        reasonsContainer.append(messageElement)

        checksContainer.append(reasonsContainer)
    })
    //Set value
    strengthMeter.style.setProperty("--value", strength)

    //Set color
    if (strength <= 35) {
        strengthMeter.innerText = "Senha Fraca"
        strengthMeter.style.setProperty("--bar-color", "red")
        strengthMeter.style.setProperty("color", "white")
    }
    else if (strength <= 75) {
        strengthMeter.innerText = "Senha Mediana"
        strengthMeter.style.setProperty("--bar-color", "yellow")
        strengthMeter.style.setProperty("color", "black")
    }
    else if (strength > 75) {
        strengthMeter.innerText = "Senha Forte"
        strengthMeter.style.setProperty("--bar-color", "lightgreen")
        strengthMeter.style.setProperty("color", "white")
    }
}

function calculateStrength(password) {
    const weaknesses = []

    weaknesses.push(lengthWeakness(password))
    weaknesses.push(lowercaseWeakness(password))
    weaknesses.push(uppercaseWeakness(password))
    weaknesses.push(numberWeakness(password))
    weaknesses.push(specialCharacterWeakness(password))

    return weaknesses
}

function lengthWeakness(password) {
    if (password.length == 0) {
        return { message: "Insira uma senha", deduction: 100, status: "error" }
    }
    else if (password.length < 8) {
        return { message: "A senha deve conter mais do 8 caracteres", deduction: 40, status: "error" }
    }
    else {
        return { message: "A senha deve conter mais do que 8 caracteres", deduction: 0, status: "success" }
    }
}

function lowercaseWeakness(password) {
    const regex = /[a-z]/g
    const type = "Letras Minusculas"

    return characterTypeWeakness(password, regex, type)
}

function uppercaseWeakness(password) {
    const regex = /[A-Z]/g
    const type = "Letras Maisculas"

    return characterTypeWeakness(password, regex, type)
}

function numberWeakness(password) {
    const regex = /[\d]/g
    const type = "Numeros"

    return characterTypeWeakness(password, regex, type)
}

function specialCharacterWeakness(password) {
    const regex = /[^\w]/g
    const type = "Caracteres especiais"

    return characterTypeWeakness(password, regex, type)
}

function characterTypeWeakness(password, regex, type) {
    let matches = password.match(regex) || []

    if (matches.length === 0) {
        return { message: `A senha deve conter ${type}`, deduction: 15, status: "error" }
    }
    else {
        return { message: `A senha deve conter ${type}`, deduction: 0, status: "success" }
    }
}