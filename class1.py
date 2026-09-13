# class soln:
#     def ele_insertion(self, arr: list, n: int):
#         for _ in range(n):
#             ele = int(input("Enter element to insert: "))
#             arr.append(ele)
#         return arr

#     def total(self, arr):
#         # Base case: empty list contributes 0 to the sum
#         if not arr:
#             return 0
#         # Recursive step
#         return arr[0] + self.total(arr[1:])

#     def factorial(self, n):
#         if n < 0:
#             return "Factorial is undefined for negative numbers"
#         if n == 0 or n == 1:
#             return 1
#         return n * self.factorial(n - 1)


# if __name__ == "__main__":
#     obj = soln()
    
#     n = int(input("Enter the number of elements to insert: "))
#     a = obj.ele_insertion([], n)
    
#     print("Inserted list:", a)
#     print("Total sum:", obj.total(a))
#     print(f"The factorial of {n} is:", obj.factorial(n))


class search:
    def __init__(self, arr):
        self.arr = arr

    def linear_search(self, target):
        for i , num in enumerate(self.arr):
            if num == target:
                return i
        return -1

    def binery_search(self, target):
        low = 0
        high = len(self.arr) - 1
        while low <= high:
            mid = low + high // 2
            if self.arr[mid] == target:
                return mid
            elif self.arr[mid] < target:
                low = mid + 1
            else:
                high = mid - 1
        return -1






if __name__ == "__main__":
    obj = search([1,2,3,4,5,6])
    a = obj.linear_search(4)
    print(a)
    b = obj.binery_search(4)
    print(b)