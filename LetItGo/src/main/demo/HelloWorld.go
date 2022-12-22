package main

import "fmt"

func main() {
	//hello world
	fmt.Println("こんにちは世界!")
	//变量声名
	var i = 1
	fmt.Println(i)
	var j int
	j = 2
	fmt.Println(j)
	h := 3
	fmt.Println(h)
	var (
		g int
		k int
	)
	g = 4
	k = 5
	fmt.Println(g)
	fmt.Println(k)
	var n, m = 7, 8
	fmt.Println(n)
	fmt.Println(m)
	//_特殊变量名 赋值丢弃
	var  _, l = 9, 0
	fmt.Println(l)

	//常量 可以只声名不使用
	const (
		c1 = iota //0
		c2        //1 自增且赋值
		c3        //2
		c4 = "ha" //独立值 iota自增不赋值
		c5        //"ha"  延续前值 iota自增不赋值
		c6 = 100  //iota自增不赋值
		c7        //延续前值
		c8 = iota //7,恢复计数
		c9        //8
	);
	s := `start
				end`
	fmt.Println(s)


}