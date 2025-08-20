# 🕹️ Projeto Aula Java 12 — Simulador de Jogo com Personagens e Papéis

Este projeto em **Java** modela um **jogo/partida** com diferentes **personagens e papéis**, aplicando conceitos de **Programação Orientada a Objetos (POO)** como herança, polimorfismo, interfaces/contratos e composição.

A ideia é representar personagens com **funções distintas** (por exemplo, *Armador*, *Pivô* e *Guerreiro*), cada um com seus atributos e comportamentos, e orquestrar uma **partida** através da classe `Jogo`.

---

## 📌 Objetivos do Projeto
- Praticar **POO em Java** com classes e hierarquias bem definidas.
- Modelar **papéis com habilidades/comportamentos** específicos.
- Integrar tudo em um **fluxo de jogo** controlado pela classe `Jogo`.
- Exercitar **encapsulamento**, **polimorfismo** e **responsabilidades** bem divididas.

---

## 🛠️ Principais Classes
- **`Personagem`** — Classe base que define atributos e comportamentos comuns aos personagens.
- **`Jogador`** — Especializa/compõe características de um personagem controlável no jogo.
- **`Armador`** — Papel com foco em estratégia e organização das jogadas (habilidades específicas).
- **`Pivo`** — Papel com foco em força/impulso e ações de impacto (habilidades específicas).
- **`Guerreiro`** — Papel combativo com ênfase em ataque/defesa (habilidades específicas).
- **`Jogo`** — Orquestra o fluxo da partida: criação/registro de personagens, turnos/ações, resultado.
- **`Main`** — Ponto de entrada da aplicação; executa um cenário de demonstração.

> Observação: os nomes dos papéis (Armador/Pivô/Guerreiro) permitem explorar **variações de comportamento** via herança/polimorfismo.

---

## ▶️ Como Executar
1. Compile os arquivos do projeto:
   ```bash
   javac src/*.java
