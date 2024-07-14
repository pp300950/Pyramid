package main

import "fmt"

func main() {
    num := 5

    // สร้างยอด
    for i := 0; i < num; i++ {
        for k := 0; k < num-i-1; k++ { // สร้างช่องว่าง
            fmt.Print(" ")
        }
        for j := 0; j < i; j++ { // สร้างใบแถบซ้ายถึงกลาง
            fmt.Print("*")
        }
        for j := 0; j < i+1; j++ { // สร้างใบแถบขวา
            fmt.Print("*")
        }
        fmt.Println()
    }

    // สร้างฐาน
    for ii := 0; ii < num-1; ii++ {
        for jj := 0; jj < ii+1; jj++ {
            fmt.Print(" ")
        }
        for kk := 0; kk < num-ii-2; kk++ {
            fmt.Print("*")
        }
        for jj := 0; jj < num-ii-1; jj++ { // สร้างใบแถบขวา
            fmt.Print("*")
        }
        fmt.Println()
    }
}
