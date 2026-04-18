package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario04BankingTransactionSystem {
    public static void main(String[] args) {
        Set<Account> validAccounts = new HashSet<>(Arrays.asList(new Account("A101"), new Account("A102")));
        Queue<Transaction> queue = new LinkedList<>(Arrays.asList(
                new Transaction("T1", "A101", 1000),
                new Transaction("T2", "A999", 500),
                new Transaction("T3", "A102", 750)
        ));
        Stack<Transaction> rollback = new Stack<>();

        while (!queue.isEmpty()) {
            Transaction transaction = queue.remove();
            if (validAccounts.contains(new Account(transaction.accountId))) {
                rollback.push(transaction);
                System.out.println("Executed: " + transaction.id);
            } else {
                System.out.println("Invalid account: " + transaction.accountId);
            }
        }

        if (!rollback.isEmpty()) {
            System.out.println("Rolled back: " + rollback.pop().id);
        }
    }

    private static final class Account {
        private final String id;

        private Account(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Account other)) {
                return false;
            }
            return Objects.equals(id, other.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    private static final class Transaction {
        private final String id;
        private final String accountId;
        private final double amount;

        private Transaction(String id, String accountId, double amount) {
            this.id = id;
            this.accountId = accountId;
            this.amount = amount;
        }
    }
}
