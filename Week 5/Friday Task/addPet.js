function handleClickPage() {
    location.href = 'homePage.html'
}

let getElements = (request) => {
    formEL = getElementsByID("formEL");
    for (let element of formEL.elements) {
        if (element.id) {
            if (element.type == 'Date') {
                element.id.replace(/-/g, '/');
            } else {
                formData[element.id] = element.value;
            }
        }
    }
}

function addPet() {
    let method = "POST";
    let url = 'http://localhost:9966/petclinic/api/pets';
    let callback = getElements;
    let headers = {
        "Content-Type": "application/json"
    }

    httpRequest(method, url, callback, headers);

    return false;
}

