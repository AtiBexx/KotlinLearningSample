fun main(args:Array<String>) {
    //pontzsám deklarálása iterálása

    var score :Int = 85
    score ++ //növeljül egyel postfix
    score -- // csökkentjük egyel postfix
    //prefix előbb visszaadja az eredeti értéket, majd növeli.
    score +=10 //növeljük 10-el
    score -=5 //csökentjük 5-el
    --score //prefix csökentjük egyel
    ++score //prefix növeljük egyel
    //előbb növeli, majd visszaadja az új értéket.

    //ha nagyobb vagy egyenlő mint 98
    if (score >= 98){
        //if (score > 88) ezt csak azt jelenti ha nagyobb mint 88
        println("Grade A")
        //külömben ha nagyobb vagy egyenlő mint 88
    }else if ( score >= 88 ){

        println("Grade B")
    //külömben
    }else
        println("cool")

        println("$score")//kiírjuk a score eredményeit
}
/*
ha önálló sorban használod őket (postfix és prefix), akkor ugyanaz a hatás.
ha egy kifejezésen belül használod őket (pl. val x = score++) akkor van külömbség
 */
