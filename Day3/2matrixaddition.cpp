
#include <iostream>
using namespace std;
#define N 3


void add(int A[][N], int B[][N], int C[][N])
{
    int i, j;
    
    for (i = 0; i < N; i++)
        for (j = 0; j < N; j++)
            C[i][j] = A[i][j] + B[i][j];
}


int main()
{

    int A[N][N] = { { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9} };

    int B[N][N] = { { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 0, 0, 0} };

    
    int C[N][N];
    int i, j;
    add(A, B, C);

    cout << "Result matrix is " << endl;
    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++)
            cout << C[i][j] << " ";
        cout << endl;
    }

    return 0;
}