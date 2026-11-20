
# 11/8/26 : 3 questions : 
def find_products(prices, budget):
    seen = {}

    for i, price in enumerate(prices):
        required = budget - price

        if required in seen:
            return [seen[required], i]

        seen[price] = i

prices = [1200, 500, 800, 1500, 700]
budget = 2000

print(find_products(prices, budget))


# def max_profit(prices):
#     min_price = prices[0]
#     max_profit = 0

#     for price in prices:
#         if price < min_price:
#             min_price = price

#         profit = price - min_price

#         if profit > max_profit:
#             max_profit = profit

#     return max_profit
# prices = [7, 1, 5, 3, 6, 4]

# print(max_profit(prices))


def longestPeriod(orders):
    int count=0;
    for(int i=0;i<orders.length;i++){
        if order[i]<order[i+1]{
            count++;
        }
    }
    return count; 

orders =[10,12,15,14,18,20,25]
print(longestPeriod(orders))


# public class Main {
#     public static int longestPeriod(int[] orders) {
#         int count = 1;
#         int longest = 1;

#         for (int i = 0; i < orders.length - 1; i++) {
#             if (orders[i] < orders[i + 1]) {
#                 count++;
#             } else {
#                 count = 1;
#             }

#             longest = Math.max(longest, count);
#         }

#         return longest;
#     }

#     public static void main(String[] args) {
#         int[] orders = {10, 12, 15, 14, 18, 20, 25};

#         System.out.println(longestPeriod(orders));
#     }
# }