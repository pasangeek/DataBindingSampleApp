
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

            binding.state = binding.state != true
        }

    }
}



layout
 android:visibility="@{state? View.VISIBLE:View.INVISIBLE}"
