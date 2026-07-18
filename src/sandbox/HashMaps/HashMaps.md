## `keySet` Trick

```
// "For every ID inside the productHashMap's Key Set..."
for (int id : productHashMap.keySet()) {
    System.out.print(id + ", ");
    System.out.print(productHashMap.get(id).getProductName() + ", ");
    System.out.print(productHashMap.get(id).getProductStock() + "\n");
}
```