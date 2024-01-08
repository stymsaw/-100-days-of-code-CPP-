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
    for(int item : arr)
    cin >> item;

    int count  = 0;     // keep count of non zeros element, helps in swaping the indicies

    for (int  i = 0; i < n; i++)
        if(arr[i] != 0) {
            swap(arr, i, count);
            count++;
        }
    
    for(int item : arr)
    cout << item << " ";
    

}
