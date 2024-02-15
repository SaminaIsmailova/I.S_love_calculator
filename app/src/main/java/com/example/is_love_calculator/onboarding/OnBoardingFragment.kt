package com.example.is_love_calculator.onboarding

class OnBoardingFragment : Fragment() {
    @Inject
    lateinit var pref: Pref
    private lateinit var binding: FragmentOnBoardingBinding

    private val adapter = OnBoardingAdapter(this::onClick)

    private fun onClick() {
        pref.onShowed()
        findNavController().navigateUp()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = adapter
        binding.indicator.setViewPager(binding.viewPager)
    }
}