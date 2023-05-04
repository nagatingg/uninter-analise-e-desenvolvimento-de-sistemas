let paragrafo = document.querySelector("#botao");

paragrafo.addEventListener("click", trocaTexto);



function trocaTexto () {
    paragrafo.innerHTML="HAHAHAH";
};

console.log(paragrafo);







/*
let pessoa = { 
    nome: "Wesley",
    idade: 27
};

let listaDesejos = ["Carro", 5, "Console"];

console.log(listaDesejos);



const nome = false;

console.log(typeof nome);

let idade = 18;
let maiorIdade = idade >= 18;

if (maiorIdade){
    console.log("Bem vindo");
} else {
    console.log("Acesso bloqueado!");
}
*/