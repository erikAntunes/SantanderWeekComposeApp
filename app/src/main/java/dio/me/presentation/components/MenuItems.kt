package dio.me.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dio.me.data.mock.Mocks
import dio.me.data.model.Feature
import dio.me.presentation.theme.SantanderDevWeekTheme
import dio.me.presentation.theme.Spacing_1
import dio.me.presentation.theme.Spacing_2


@Composable
fun MenuItems(
    modifier: Modifier = Modifier,
    features: List<Feature> = emptyList()
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(Spacing_2)
    ) {
        items(features) { feature ->
            AppCard(
                modifier = Modifier
                    .size(
                        width = 108.dp,
                        height = 108.dp
                    )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .padding(top = Spacing_1),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SvgImage(
                        modifier = Modifier
                            .height(36.dp)
                            .width(36.dp),
                        url = feature.icon
                    )
                    Text(
                        text = feature.description,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xFF616161),
                            letterSpacing = 0.14.sp
                        ),
                        modifier = Modifier
                            .padding(
                                top = Spacing_1,)
                    )
                }
            }

        }

    }
}


@Preview
@Composable
fun MenuItemsPreview() {
    SantanderDevWeekTheme {
        MenuItems(features = Mocks.featureList)
    }
}