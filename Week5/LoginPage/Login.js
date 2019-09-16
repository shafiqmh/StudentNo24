

function handleClickPage() {
    location.href = 'Register.html';
}




function handleFormSubmit(formEl) {

    console.log('Login atempted');


    const formData = {};
    for (let element of formEl.elements) {
        // console.log(element.value)
        if (element.id != "") {
            formData[element.id] = element.value;
        }
    }

    const xhr = new XMLHttpRequest();
    xhr.onload = () => {
        /*handle response*/
        console.log(xhr.status, xhr.response);
    };
    xhr.open(
        'GET',
        `https://us-central1-qac-sandbox-c347f.cloudfunctions.net/login?username=${formData.username}&password=${formData.password}`);
    // xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send();

    return false;
}


