from Utils import Utils

if __name__ == "__main__":
    caminho = "./telephony_sessions.txt"
    utils = Utils()
    sessoes = utils.carregarSessoes(caminho)
    print(f"Total de sessões lidas: {len(sessoes)}")

    while True:
        print("\nMenu:")
        print("1 - Buscar por número")
        print("2 - Listar todos")
        print("0 - Sair")
        opcao = input("Escolha uma opção: ").strip()

        if opcao == "0":
            print("Encerrando...")
            break
        elif opcao == "1":
            numero = input("Digite o número do telefone: ").strip()
            sessao = sessoes.get(numero)
            if sessao:
                print("\nSessão encontrada:")
                print(sessao)
            else:
                print("Número não encontrado.")
        elif opcao == "2":
            print("\nListando todas as sessões:")
            for sessao in sessoes.values():
                print(sessao)
                print("----------------------------------------")
        else:
            print("Opção inválida.")