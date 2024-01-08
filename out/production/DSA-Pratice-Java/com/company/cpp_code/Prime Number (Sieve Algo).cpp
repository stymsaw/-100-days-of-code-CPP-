#include <iostream>
#include <bits/stdc++.h>

using namespace std;


int main() {

//    Sieve of Eratosthenes Algorithm

    int n = 100;
    vector<bool> isPrime(n + 1, true);
    isPrime[0] = false;
    isPrime[1] = false;

    for (int i = 2; i < n; ++i) {
        if (isPrime[i]) {
            cout << i << " ";
            for (int j = i * i; j < n; j = j + i)
                isPrime[j] = false;
        }
    }


    return 0;
}
