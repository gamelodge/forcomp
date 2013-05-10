object test {
  println("Welcome to the Scala worksheet")
  def f(c:Char,xs:List[Char]):Int=xs match{
  case List(x)=>if(x==c) 1 else 0
  case x::xs => if (x==c) 1+f(c,xs) else f(c,xs)
  case _ =>0
  }
  def occ(ch:String):List[(Char,Int)]=ch.toList.map(c => (c,f(c,ch.toList)))
  val ch="abaddc".toList
  val aa =3
}