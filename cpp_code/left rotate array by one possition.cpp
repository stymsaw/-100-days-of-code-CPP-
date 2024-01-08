#include<iostream>

using namespace std;

void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

int main() {

    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    int temp = arr[0];     // keep count of non zeros element, helps in swapping the indices

    for (int i = 1; i < n; i++)
        arr[i - 1] = arr[i];
    arr[n - 1] = temp;


    for (int item: arr)
        cout << item << " ";


}
