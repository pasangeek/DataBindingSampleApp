
## DataBindingSampleApp


## this contains 

Sample data binding code
## Authors

- [@pasangeek](https://github.com/pasangeek)


## License

[MIT](https://choosealicense.com/licenses/mit/)


## Usage/Examples

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

     val  binding: ActivityMainBinding = DataBindingUtil.setContentView(
         this,R.layout.activity_main)
//        val txtName = findViewById<TextView>(R.id.textView1)
//        txtName.text = "hello OOO"
//binding.textView1.text = "helloooo"
        binding.name="hHHelllo1"
        binding.button.setOnClickListener {
//which are similer to 
//if(binding.state==true )
//binding.state=false
//else
//binding.state=true
            binding.state = binding.state != true
        }

    }
}



layout
 android:visibility="@{state? View.VISIBLE:View.INVISIBLE}"
 
 xml
 android:visibility="@{state? View.VISIBLE:View.INVISIBLE}"

DataBindingSampleApp/app/src/main/res/layout/activity_main.xml
 <?xml version="1.0" encoding="utf-8"?>
<layout xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <data>
        <import type="android.view.View"/>
        <variable
            name="name" type="String" />
        <variable
            name="state" type="Boolean" />

    </data>
