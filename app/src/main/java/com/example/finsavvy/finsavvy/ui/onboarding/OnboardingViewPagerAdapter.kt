package com.example.finsavvy.finsavvy.ui.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finsavvy.R
import com.example.finsavvy.databinding.ItemOnboardingBinding

class OnboardingViewPagerAdapter : RecyclerView.Adapter<OnboardingViewPagerAdapter.OnboardingViewHolder>() {

    private val onboardingItems = listOf(
        OnboardingItem(
            "Welcome to FinSavvy!",
            "Track your spending, manage budgets, and visualize where your money goes — all in one simple app.",
            R.drawable.itemonboarding1
        ),
        OnboardingItem(
            "Track. Limit. Save — the smart way",
            "Set spending limits by category, get real-time alerts, and track your progress effortlessly.",
            R.drawable.itemonboarding2
        ),
        OnboardingItem(
            "Your privacy is our priority.",
            "Everything you add stays secure and just for you.\n" +
                    "With password protection and safe backups, your data is always in good hands.",
            R.drawable.itemonboarding3
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        val binding = ItemOnboardingBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OnboardingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        holder.bind(onboardingItems[position])
    }

    override fun getItemCount() = onboardingItems.size

    class OnboardingViewHolder(private val binding: ItemOnboardingBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: OnboardingItem) {
            binding.textTitle.text = item.title
            binding.textDescription.text = item.description
            binding.imageOnboarding.setImageResource(item.imageResId)
        }
    }

    data class OnboardingItem(
        val title: String,
        val description: String,
        val imageResId: Int
    )
} 