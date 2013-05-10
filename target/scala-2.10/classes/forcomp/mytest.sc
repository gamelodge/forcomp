package forcomp
import Anagrams._
object mytest {
val word="meTanoTe"                               //> word  : String = meTanoTe

def f(c:Char):Char={
if (c=='a') 'e' else c
}                                                 //> f: (c: Char)Char
word.toLowerCase.toList.groupBy(x=>f(x))          //> res0: scala.collection.immutable.Map[Char,List[Char]] = Map(e -> List(e, a, 
                                                  //| e), n -> List(n), t -> List(t, t), m -> List(m), o -> List(o))

val s=List("abdbd","ccccaa")                      //> s  : List[String] = List(abdbd, ccccaa)
s.reduceRight(_++_)                               //> res1: String = abdbdccccaa
val z=List(('c',3))                               //> z  : List[(Char, Int)] = List((c,3))
val x=z.head                                      //> x  : (Char, Int) = (c,3)
val aux =(0 to x._2).map((x._1,_)).toList.filter(_._2>0)
                                                  //> aux  : List[(Char, Int)] = List((c,1), (c,2), (c,3))


def sub(a:List[(Char,Int)],b:List[(Char,Int)]):List[(Char,Int)]=a.map(x=>b.find(_._1==x._1) match{
case Some(z)=>(x._1,x._2-z._2)
case None =>x
})                                                //> sub: (a: List[(Char, Int)], b: List[(Char, Int)])List[(Char, Int)]
sub(List(('c',3)),List(('c',1)))                  //> res2: List[(Char, Int)] = List((c,2))

}