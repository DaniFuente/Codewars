#result 2
recipe1 = {'flour': 500, 'sugar': 200, 'eggs': 1}
available1 = {'flour': 1200, 'sugar': 1200, 'eggs': 5, 'milk': 200}
#result 0
recipe2 = {'apples': 3, 'flour': 300, 'sugar': 150, 'milk': 100, 'oil': 100}
available2 = {'sugar': 500, 'flour': 2000, 'milk': 2000}

def cakes(recipe, available):
    result = list()
    for key in recipe.keys():
        if key in available.keys():
            result.append(int(available[key]/recipe[key]))
        else:
            return 0
    return min(result)

print(cakes(recipe2, available2))
