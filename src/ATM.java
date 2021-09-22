/*
Pooja would like to withdraw X $US from an ATM. The cash machine will
 only accept the transaction if X is a multiple of 5 and Pooja's account
 balance has enough cash to perform the withdrawal transaction (including bank chargers).
 For each sucessful withdrawal the bank charges 0.05 $US. Calculate Pooja's account balance
 after an attempted transaction.

 */

class ATM
{
    public static void main(String[] args)
    {
        double amt_to_withdraw=20, account_balance=1000;

        //Check the input
        if( amt_to_withdraw>0 && amt_to_withdraw <=2000 && amt_to_withdraw%5==0 && account_balance>0 && amt_to_withdraw+.5<account_balance)
        {
            account_balance = account_balance-amt_to_withdraw-.5;
        }
        System.out.println("Balance : "+account_balance);
    }
}
/*
0. Take input
1. Restrict amount to multiples of 5, Non negative, amount 0 < X <= 2000
2. Balance non negative
3. Check enough cash for withdrawal
4. Check if we can deduct the charges, Deduct charges
5. Caculate and display
6. Output Balance after withdrawal in any case
 */