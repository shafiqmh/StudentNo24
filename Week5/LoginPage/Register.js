

function handleClickPage() {
    location.href = 'Login.html';
}




function handleFormSubmit(formEl) {

    console.log('FORM SUBMITTED');


    // const formData = {
    //     username: 'whatever',
    //     password: 'supersecurepassword',
    //     SOMETHING: 'ELSE'
    // };



    const formData = {};
    for (let element of formEl.elements) {
        // console.log(element.value)
        if (element.id != "") {
            formData[element.id] = element.value;
        }
    }


    const xhr = new XMLHttpRequest();
    xhr.onload = () => { /* handle response */ };
    xhr.open('POST', 'https://us-central1-qac-sandbox-c347f.cloudfunctions.net/setUser');
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(JSON.stringify(formData));

    return false;
}













