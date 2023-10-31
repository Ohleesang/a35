package com.example.a35

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(price: Int, money: Int, count: Int): Long {
                var answer: Long = 0
                for(i in 1..count){
                    answer += price*i
                }
                answer -= money
                if(answer<=0) answer = 0

                return answer
            }
        }
        val a = Solution()
        a.solution(3,20,4)
    }
}