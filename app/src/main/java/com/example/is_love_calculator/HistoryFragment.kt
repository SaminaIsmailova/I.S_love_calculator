package com.example.is_love_calculator

class HistoryFragment : Fragment() {

    private lateinit var binding: FragmentHistoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = App.appDatabase.getDao().getAllSort()

        list.forEach {
            binding.tvListHistory.text =
                list.joinToString(separator = "", prefix = "", postfix = "")
        }
    }
}