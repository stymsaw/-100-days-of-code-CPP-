#include<iostream>

using namespace std;

void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void reverse_Array(int arr[], int left, int right) {
    while (left < right) {
        swap(arr, left, right);
        left++;
        right--;
    }
}

void rotate_left(int arr[], int size, int rotate) {
    reverse_Array(arr, 0, rotate - 1);
    reverse_Array(arr, rotate, size - 1);
    reverse_Array(arr, 0, size - 1);
}

int main() {

    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    int rotation;
    cin >> rotation;

    rotate_left(arr, n, rotation);

    for (int item: arr)
        cout << item << " ";
}
