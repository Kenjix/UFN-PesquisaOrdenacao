def bubble_sort(lista: list[int]) -> None:
    """
    Ordena uma lista usando o algoritmo Bubble Sort.

    Args:
        lista (list[int]): Lista de inteiros a ser ordenada.
    """
    n = len(lista)
    qtd_comparacoes = 0
    qtd_trocas = 0
    for i in range(n):
        for j in range(0, n - i - 1):
            qtd_comparacoes += 1
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
                qtd_trocas += 1
    return lista, qtd_comparacoes, qtd_trocas


def selection_sort(lista: list[int]) -> None:
    """
    Ordena uma lista usando o algoritmo Selection Sort.

    Args:
        lista (list[int]): Lista de inteiros a ser ordenada.
    """
    n = len(lista)
    qtd_comparacoes = 0
    qtd_trocas = 0
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            qtd_comparacoes += 1
            if lista[j] < lista[min_idx]:
                min_idx = j
        if min_idx != i:
            lista[i], lista[min_idx] = lista[min_idx], lista[i]
            qtd_trocas += 1
    return lista, qtd_comparacoes, qtd_trocas


def insertion_sort(lista: list[int]) -> None:
    """
    Ordena uma lista usando o algoritmo Insertion Sort.

    Args:
        lista (list[int]): Lista de inteiros a ser ordenada.
    """
    qtd_comparacoes = 0
    qtd_trocas = 0
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0:
            qtd_comparacoes += 1
            if chave < lista[j]:
                lista[j + 1] = lista[j]
                qtd_trocas += 1
                j -= 1
            else:
                break
        lista[j + 1] = chave
    return lista, qtd_comparacoes, qtd_trocas

def cocktail_sort(lista):
    """
    Ordena uma lista usando o algoritmo Agitação (Cocktail Shaker Sort).

    Args:
        lista (list[int]): Lista de inteiros a ser ordenada.
    """    
    tmp = 0
    ini = 0
    fim = len(lista)
    qtd_comparacoes = 0
    qtd_trocas = 0

    while True:
        houve_troca = False
        for i in range(ini, fim-1):
            qtd_comparacoes += 1
            if lista[i] > lista[i+1]:
                qtd_trocas += 1
                houve_troca = True
                tmp = lista[i]
                lista[i] = lista[i+1]
                lista[i+1] = tmp

        if not houve_troca:
            break
        fim -= 1

        houve_troca = False
        for i in range(fim-1, ini, -1):
            qtd_comparacoes += 1
            if lista[i] < lista[i-1]:
                qtd_trocas += 1
                houve_troca = True
                tmp = lista[i]
                lista[i] = lista[i-1]
                lista[i-1] = tmp
        ini += 1

    return lista, qtd_comparacoes, qtd_trocas

def pent_sort(lista):
    """
    Ordena uma lista usando o algoritmo Pent Sort.
    Args:
        lista (list[int]): Lista de inteiros a ser ordenada.
    """
    houve_troca = True
    tmp = 0
    distancia = len(lista)
    qtd_comparacoes = 0
    qtd_trocas = 0
    
    while houve_troca or distancia > 1:
        distancia = int(distancia / 1.3)
        if distancia < 1:
            distancia = 1
        houve_troca = False
        for i in range(len(lista) - distancia):
            qtd_comparacoes += 1
            if lista[i] > lista[i + distancia]:
                qtd_trocas += 1
                houve_troca = True
                tmp = lista[i]
                lista[i] = lista[i + distancia]
                lista[i + distancia] = tmp
        