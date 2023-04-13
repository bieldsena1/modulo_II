let artista1 = {
    nome: "Queen",
    anoLancamento: 1973,
    melhoresMusicas: ["Bohemian Rhapsody", "Don't Stop Me Now", "We Will Rock You"],
    integrantes: [
      { nome: "Freddie Mercury", paisOrigem: "Reino Unido", idade: 45 },
      { nome: "Brian May", paisOrigem: "Reino Unido", idade: 74 },
      { nome: "John Deacon", paisOrigem: "Reino Unido", idade: 70 },
      { nome: "Roger Taylor", paisOrigem: "Reino Unido", idade: 72 }
    ],
    estilo: "Rock"
  };
  
  let artista2 = {
    nome: "The Beatles",
    anoLancamento: 1963,
    melhoresMusicas: ["Hey Jude", "Let It Be", "Yesterday"],
    integrantes: [
      { nome: "John Lennon", paisOrigem: "Reino Unido", idade: 40 },
      { nome: "Paul McCartney", paisOrigem: "Reino Unido", idade: 79 },
      { nome: "George Harrison", paisOrigem: "Reino Unido", idade: 58 },
      { nome: "Ringo Starr", paisOrigem: "Reino Unido", idade: 81 }
    ],
    estilo: "Rock"
  };
  
  let artista3 = {
    nome: "Beyoncé",
    anoLancamento: 2003,
    melhoresMusicas: ["Crazy In Love", "Single Ladies", "Formation"],
    integrantes: [
      { nome: "Beyoncé", paisOrigem: "Estados Unidos", idade: 40 }
    ],
    estilo: "R&B"
  };
  
  
  let database = [];
  

  database.push(artista1);
  database.push(artista2);
  database.push(artista3);
  
 
  console.log("Lista original:");
  console.log(database);
  
 
  database.sort(function(a, b) {
    return a.anoLancamento - b.anoLancamento;
  });
  

  console.log("Lista ordenada:");
  console.log(database);
  

  database.pop();
  

  console.log("Lista após a remoção:");
  console.log(database);