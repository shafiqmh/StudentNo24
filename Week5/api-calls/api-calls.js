
const req = new XMLHttpRequest();
req.open('GET', 'https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json');

req.onload = () => {
    //console.log('IT WORKED', req.response);  //we have a load of data
    const data = JSON.parse(req.response); //turning data into object (stringify does opposite)
    console.log(data);



    //const para = document.createElement('div');
    // .style.backgroundColor = 'green'
    function changebackground(id, color) {
        document.getElementById(id).style.background = 'color';
    }



    const name = document.createElement('h1');
    name.innerText = data.squadName;
    mainName.append(name);

    var people = document.getElementById('membersList');
    var info = document.getElementById('details');
    for (let member of data.members) {
        // create elements and put them in memberslist
        //createElement

        const namePara = document.createElement('p');
        namePara.innerText = member.name;
        people.appendChild(namePara);

        const agePara = document.createElement('ul');
        agePara.innerText = 'Age: ' + member.age;
        people.appendChild(agePara);

        const identityPara = document.createElement('ul');
        identityPara.innerText = 'Secret Identity: ' + member.secretIdentity;
        people.appendChild(identityPara);

        const powersPara = document.createElement('ul');
        powersPara.innerText = 'Power: ' + member.powers;
        people.appendChild(powersPara);


    }



    const formed = document.createElement('h4');
    formed.innerText = 'Formed: ' + data.formed;
    main.append(formed);

    const status = document.createElement('h4');
    status.innerText = 'Active Status: ' + data.active;
    main.append(status);

    const base = document.createElement('h4');
    base.innerText = 'Secret Base: ' + data.secretBase;
    main.append(base);


    //para.appendChild(people);
    // const newElement = document.createElement('p');
    // newElement.id = 'members';
    // //members.innerHTML = 'member';

    // people.innerHTML = ('<li>' + data.members + '</li>');
}

function makeRequest() {
    return new Promise((resolve, reject) => {

        //const myPromise = new Promise((resolve, reject) => {
        const xhr = new XMLHttpRequest();
        xhr.onload = () => {
            if (xhr.status == 200) {
                resolve(xhr.response);
            } else {
                reject('Request FAilure!')
            }
        };
        xhr.open('GET', 'https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json');
        xhr.send();
    });
}
makeRequest()
    .then(data => {
        console.log('It worked!', data);
        return makeRequest();
    })
    .catch(error => {
        console.log('something went wrong', error);
    });





req.send();