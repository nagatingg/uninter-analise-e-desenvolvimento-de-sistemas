let botao1 = document.querySelector("#botao1");
botao1.style.background="blue";


/* Modelo trabalhoso
botao1.addEventListener("mouseover", trocaVerde);

function trocaVerde () {
    botao1.style.background="green";
}
*/

// Modelo chamando a função na mesma linha agora a seguir:

let estaQuebrado = false;
let contaCliques = 0;

botao1.addEventListener("mouseover", e => {
    if(estaQuebrado === false) {
        botao1.style.background="green";
    }
});

botao1.addEventListener("mouseout", e => {
    if(estaQuebrado === false) {
        botao1.style.background="blue"
    };
});

botao1.addEventListener("click", e => {
    contaCliques++;

    if(contaCliques >= 10) {
        botao1.style.background="red";
        botao1.innerHTML="QUEBREI";
        estaQuebrado = true;
    }    
});

