/*int towerOfHanoi(int n, int from, int to, int aux) {
    int c=0;
    // code here
    if(n==1){
        return 1;
    }
    c+=towerOfHanoi(n-1,from,aux,to);
    c+=1;
    c+=towerOfHanoi(n-1,aux,to,from);
    return c;
}*/
int towerOfHanoi(int n, int from, int to, int aux)
{
    if (n == 1)
        return 1;

    return 2 * towerOfHanoi(n - 1, from, aux, to) + 1;
}